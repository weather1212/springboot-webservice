var main = {
    init: function () {
        var _this = this;

        // 1. 글 등록
        $('#btn-save').on('click', function () {
            _this.save();
        });

        // 2. 글 수정
        $('#btn-update').on('click', function () {
            _this.update();
        });

        // 3. 글 삭제
        $('#btn-delete').on('click', function () {
            _this.delete();
        });
    },

    // 1. 글 등록
    save: function () {
        var data = {
            title  : $('#title').val(),
            author : $('#author').val(),
            content: $('#content').val()
        };

        $.ajax({
            type       : 'POST',
            url        : '/api/v1/posts',
            dataType   : 'json',
            contentType: 'application/json; charset=utf-8',
            data       : JSON.stringify(data)
        }).done(function () {
            alert('글이 등록되었습니다.');
            window.location.href = '/'; // 글 드옭이 성공하면 메인페이지(/)로 이동
        }).fail(function (error) {
            alert(JSON.stringify(error));
        });
    },

    // 2. 글 수정
    update : function () {
        var data = {
            title: $('#title').val(),
            content: $('#content').val()
        };

        var id = $('#id').val();

        $.ajax({
            type: 'PUT',
            url: '/api/v1/posts/'+id,
            dataType: 'json',
            contentType:'application/json; charset=utf-8',
            data: JSON.stringify(data)
        }).done(function() {
            alert('글이 수정되었습니다.');
            window.location.href = '/';
        }).fail(function (error) {
            alert(JSON.stringify(error));
        });
    },

    // 3. 글 삭제
    delete : function () {
        var id = $('#id').val();

        $.ajax({
            type: 'DELETE',
            url: '/api/v1/posts/'+id,
            dataType: 'json',
            contentType:'application/json; charset=utf-8'
        }).done(function() {
            alert('글이 삭제되었습니다.');
            window.location.href = '/';
        }).fail(function (error) {
            alert(JSON.stringify(error));
        });
    }
};

main.init();