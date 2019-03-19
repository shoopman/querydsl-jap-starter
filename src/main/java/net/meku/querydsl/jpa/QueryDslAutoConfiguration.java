package net.meku.querydsl.jpa;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.support.QuerydslJpaPredicateExecutor;

import javax.persistence.EntityManager;

/**
 * @author LiangBin
 */
@ConditionalOnClass({JPAQueryFactory.class, QuerydslJpaPredicateExecutor.class})
@ConditionalOnMissingBean({JPAQueryFactory.class})
@AutoConfigureAfter({JpaRepositoriesAutoConfiguration.class})
public class QueryDslAutoConfiguration {

    @Bean
    @Autowired
    public JPAQueryFactory jpaQuery(EntityManager entityManager) {
        return new JPAQueryFactory(entityManager);
    }
}
