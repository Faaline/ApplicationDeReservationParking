package sn.diagnetech.myapp.repository.search;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import sn.diagnetech.myapp.domain.User;

/**
 * Spring Data Elasticsearch repository for the User entity.
 */
public interface UserSearchRepository extends ElasticsearchRepository<User, Long> {}
