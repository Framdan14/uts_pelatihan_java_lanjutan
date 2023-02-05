package com.pub.course.dto;

// import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GuruDto {
    private String nip;
    private String namaGuru;
    private String gender;
    private String noTelepon;
    private Integer fkMapelId;
}
