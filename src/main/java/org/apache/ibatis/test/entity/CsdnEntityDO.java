package org.apache.ibatis.test.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.test.constants.SexEnum;

import java.util.Date;

/**
 *
 * @author ligang25@58.com
 * @date 2020/10/23 10:22
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CsdnEntityDO {
    private Integer id;

    private String title;

    private Date createTime;

    private String content;

    private String author;

    private SexEnum sex;
}
