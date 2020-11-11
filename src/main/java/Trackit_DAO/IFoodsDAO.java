package Trackit_DAO;

import java.util.List;

import org.springframework.stereotype.Component;

import com.trackit.dto.Foods;


@Component
public interface IFoodsDAO {

	List<Foods> fetch(String searchFilter) throws Exception;

}