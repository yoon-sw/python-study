package com.kiswire.query.service;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.qlrm.mapper.JpaResultMapper;
import org.springframework.stereotype.Service;

import com.kiswire.query.domain.ProductDTO;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ProductService {

	private final EntityManager em; //JpaRepository가 이놈을 상속해서 구현되어있음
	
	public ProductDTO test1(Long id) {
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT id, name, price, if(price>1000,1,0) as level ");
		sb.append("FROM product WHERE id = ?");
		
		Query query = em.createNativeQuery(sb.toString())
				.setParameter(1, id);
		
		//라이브러리 필요 id,name,price, level = QLRM 라이브러리(쿼리의 결과를 클래스에 매핑)
		JpaResultMapper result = new JpaResultMapper();		
		ProductDTO productDTO = result.uniqueResult(query, ProductDTO.class);
		
		return productDTO;
		
	}
	
}
