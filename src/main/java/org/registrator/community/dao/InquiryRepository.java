package org.registrator.community.dao;

import java.util.List;

import org.registrator.community.entity.Inquiry;
import org.registrator.community.entity.User;
import org.registrator.community.enumeration.InquiryType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface InquiryRepository extends JpaRepository<Inquiry,Integer>{
	
	@Query("Select i"+
			" From Inquiry i" +
			" Where i.user = :user and i.inquiryType = :inquiryType" ) 				//and d.inquiryType = :inquiryType
	public List<Inquiry> findByUserAndInquiryType(@Param("user")User user ,@Param("inquiryType")InquiryType inquiryType);			
}
