package mybatis.dao;


import com.kosa.mini.domain.member.LoginDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface LoginMapper {

    @Select("select password , email from members where email = #{email} AND password = #{password}") // 여기 안에서는 세미클론 x
    public LoginDTO getUser(String email,String password); // list 한번에 담을때 필요하고 이 로그인 매퍼는 리턴값을 하나만 받기때문에 단일 객체인 LoginDTO를 써야한다.
}
