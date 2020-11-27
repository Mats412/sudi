package edu.jmu.sudi.dao;

import edu.jmu.sudi.entity.FoodattrEntity;
import edu.jmu.sudi.entity.FoodvalueEntity;
import edu.jmu.sudi.vo.FoodattrVo;
import edu.jmu.sudi.vo.FoodvalueVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 菜品规格持久层
 * @author LiangJie
 */
public interface FoodvalueMapper {

    /**
     * 查找该规格组下的规格数量
     * @param foodattrId
     * @return
     */
    public Integer findCountByFoodattrId(Long foodattrId);

    /**
     * 新增菜品的规格值
     * @param foodId
     * @param foodattrId
     * @param foodvalueName
     * @return
     */
    public Integer addFoodvalue(@Param("foodId") Long foodId, @Param("foodattrId") Long foodattrId, @Param("foodvalueName") String foodvalueName);

    /**
     * 删除某个菜品的所有规格值
     * @param foodId
     * @return
     */
    public Integer deleteFoodvalueByFoodId(Long foodId);

}
