package edu.jmu.sudi.service;

import edu.jmu.sudi.entity.UserEntity;
import edu.jmu.sudi.utils.LayuiTableDataResult;
import edu.jmu.sudi.vo.UserVo;

import javax.servlet.http.HttpSession;
import java.util.Map;

public interface UserService {

    /**
     * 用户登录方法，根据用户名和密码校验用户的信息是否正确
     * @return
     */
    public Map<String, Object> login(String usernane, String password, HttpSession session);

    /**
     * 用户退出登录时的业务逻辑
     * @param session
     */
    public void exit(HttpSession session);

    /**
     * 根据页面条件查询用户列表
     * @param vo
     * @return
     */
    public LayuiTableDataResult findUserListByPage(UserVo vo);

    /**
     * 后台添加用户
     * @param vo
     * @return
     */
    public Map<String, Object> addUser(UserVo vo);

    /**
     * 后台修改用户信息
     * @param vo
     * @return
     */
    public Map<String, Object> modifyUserBackstage(UserVo vo);

    /**
     * 重置用户密码
     * @param userId
     * @return
     */
    public Map<String, Object> resetPassword(Long userId);
}
