package by.gurinovich.flowershop.model;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.Instant;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
abstract class AuditEntity<U> {

    @Column(name = "created_at")
    @CreatedDate
    protected Instant createdAt;

    @Column(name = "last_modified_at")
    @LastModifiedDate
    protected Instant lastModifiedAt;

    @ManyToOne
    @JoinColumn(name = "created_by", referencedColumnName = "id")
    @CreatedBy
    protected U createdBy;

    @ManyToOne
    @JoinColumn(name = "last_modified_by", referencedColumnName = "id")
    @LastModifiedBy
    protected U lastModifiedBy;

}
