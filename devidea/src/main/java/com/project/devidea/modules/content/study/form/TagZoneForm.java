package com.project.devidea.modules.content.study.form;

import com.project.devidea.modules.tagzone.tag.Tag;
import com.project.devidea.modules.tagzone.zone.Zone;
import lombok.Data;

import java.util.Set;
@Data
public class TagZoneForm {
    Set<String>  tags;
    String city;
    String province;
    public TagZoneForm(Set<Tag> tags, Zone location) {
        tags.stream().forEach(tag -> {
            this.tags.add(tag.getFirstName());
        });
        city=location.getCity();
        province=location.getProvince();
    }
}
