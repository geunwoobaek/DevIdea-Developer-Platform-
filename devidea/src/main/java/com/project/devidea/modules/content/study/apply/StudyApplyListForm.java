package com.project.devidea.modules.content.study.apply;

import com.project.devidea.modules.account.Account;
import com.project.devidea.modules.content.study.Study;
import lombok.Data;

import javax.validation.constraints.NotBlank;
@Data
public class StudyApplyListForm {
    @NotBlank
    Long id; //studyid

    @NotBlank
    String userName;

    @NotBlank
    String studyName;


    public void setUserName(Account account) {
        userName=account.getUserName();
    }

    public void setStudy(Study study) {
        studyName=study.getTitle();
    }
}
