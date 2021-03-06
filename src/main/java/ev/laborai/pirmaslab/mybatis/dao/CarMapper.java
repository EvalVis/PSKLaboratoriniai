package ev.laborai.pirmaslab.mybatis.dao;

import ev.laborai.pirmaslab.entities.Rider;
import ev.laborai.pirmaslab.mybatis.model.Car;
import org.mybatis.cdi.Mapper;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface CarMapper {
    /**
     * My implemented method to get all riders related with the car (many to many relationship).
     */
    List<Rider> getRiders(Long id);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.CAR
     *
     * @mbg.generated Mon Mar 14 12:55:58 EET 2022
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.CAR
     *
     * @mbg.generated Mon Mar 14 12:55:58 EET 2022
     */
    int insert(Car record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.CAR
     *
     * @mbg.generated Mon Mar 14 12:55:58 EET 2022
     */
    Car selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.CAR
     *
     * @mbg.generated Mon Mar 14 12:55:58 EET 2022
     */
    List<Car> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.CAR
     *
     * @mbg.generated Mon Mar 14 12:55:58 EET 2022
     */
    int updateByPrimaryKey(Car record);
}