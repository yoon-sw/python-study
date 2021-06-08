package com.kiswire.maiatomongo.nosql.domain;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.kiswire.maiatomongo.rdb.domain.Machine001;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Document("fda001") //컬렉션이름
public class MongoFda001 {
	
	@Id
	private String _id;//몽고에서 만들어지는 object id
	
	private Long id;

	@Field(name="FDA001_R0037")
	private String fda001R0037;

	@Field(name="FDA001_R0038")
	private String fda001R0038;
	
	@Field(name="FDA001_R0039")
	private String fda001R0039;
	
	@Field(name="FDA001_R0040")
	private String fda001R0040;
	
	private Machine001 machine;
}
