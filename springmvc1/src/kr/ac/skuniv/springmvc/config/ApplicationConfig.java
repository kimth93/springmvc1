package kr.ac.skuniv.springmvc.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import com.mysql.jdbc.Driver;

@Configuration	//configuration인지 알려주기
@ComponentScan(basePackages= {"kr.ac.skuniv.springmvc.service","kr.ac.skuniv.springmvc.dao"})	//읽어오기 내가 등록하고자 하는 bean위에 컴포넌트
@Import({MybatisConfig.class})	//config끼리 임포트 가능하다
public class ApplicationConfig {
	@Bean
	public DataSource dataSource() {
		SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
		dataSource.setDriverClass(Driver.class); //pom의
		dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/skudb?serverTimezone=UTC");
		dataSource.setUsername("sku");
		dataSource.setPassword("sku");
		return dataSource;
	
		
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate() {
		return new JdbcTemplate(dataSource());
	}
	

}
