package com.sunuping.sunupcrm.repository;

import com.sunuping.sunupcrm.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CommodityRepository extends JpaRepository<User,Long>, JpaSpecificationExecutor<User> {
}
