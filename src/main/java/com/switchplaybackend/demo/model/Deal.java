package com.switchplaybackend.demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.switchplaybackend.demo.util.DealStatus;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Date;
import java.util.UUID;

@Entity
@Table(name = "deals", catalog = "switch_play")
@Data
public class Deal {

    protected Deal(){

    }

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private UUID id;

    private UUID gameListedId;

    private UUID offlineUserID;

    private String offlineUserName;

    private UUID activeUserID;

    private String gameSentTitle;

    private String gameSentPlatform;

    private String gameSentImage;

    private Date date;

    private DealStatus status = DealStatus.PENDING; // pending by default. Can be accepted or rejected also

}
