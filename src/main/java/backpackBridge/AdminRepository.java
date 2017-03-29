package backpackBridge;


import org.springframework.stereotype.Component;

@Component
public interface AdminRepository extends
org.springframework.data.repository.CrudRepository<Admin, String>{

}