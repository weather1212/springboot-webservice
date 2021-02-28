package com.hoseong.springboot.web.dto;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {

    @Test
    public void 롬복_기능_테스트() {
        // given
        String name = "test";
        int amount = 1000;

        // when
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        // then
        // assertThat : 테스트 검증 메소드, 검증하고 싶은 메소드 인자로 받음
        // isEqualTo : assertj의 동등 비교 메소드, assertThat 에 있는 값과 isEqualTo의 값을 비교해서 같을 때만 성공
        assertThat(dto.getName())
                .isEqualTo(name);
        assertThat(dto.getAmount())
                .isEqualTo(amount);
    }
}
