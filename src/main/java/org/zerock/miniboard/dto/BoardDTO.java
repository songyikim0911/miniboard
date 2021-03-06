package org.zerock.miniboard.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class BoardDTO {

    private Long bno;
    private int count;
    private String title, writer, content;
    private Timestamp regdate;


}
