package com.puppypaws.project.repository;

import com.puppypaws.project.entity.Dogstagram;
import com.puppypaws.project.model.IDogstagram;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DogstagramRepository extends JpaRepository<Dogstagram, Long> {

    @Query(value =
            "SELECT dogstagram.id AS id," +
            "dogstagram.description AS description," +
            "attachment.url AS url," +
            "attachment.url2 AS url2," +
            "attachment.url3 AS url3," +
            "member.nickname AS nickname," +
            "member.id AS user_id," +
            "member.profile_url AS profile_url," +
            "dogstagram_like.nickname AS last_liked_nickname," +
            "dogstagram.created_at AS created_at," +
            "(SELECT COUNT(m.id) AS total_like FROM dogstagram_like m WHERE m.dogstagram_id = dogstagram.id) AS total_like," +
            "EXISTS(select dogstagram_like.id" +
            "                from dogstagram_like" +
            "                where dogstagram_like.user_id = :id" +
            "            ) AS is_liked, dogstagram.created_at AS created_at " +
            "FROM dogstagram dogstagram " +
            "INNER JOIN attachment attachment ON dogstagram.id = attachment.dogstagram_id " +
            "INNER JOIN member member ON member.id = dogstagram.member_id " +
            "LEFT JOIN (SELECT (select nickname from member where id = :id) as nickname," +
            "               dogstagram_id" +
            "           FROM dogstagram_like dogstagram_like ORDER BY dogstagram_like.created_at DESC) dogstagram_like" +
            "           ON dogstagram_like.dogstagram_id = dogstagram.id " +
            "ORDER BY dogstagram.created_at DESC " +
            "LIMIT :take " +
            "OFFSET :skip", nativeQuery = true)
    public List<IDogstagram> getDogstagramList(@Param(value = "id") Long id, @Param(value = "take") int take, @Param(value = "skip") int skip);

    @Query(value =
            "SELECT dogstagram.id AS id," +
                    "dogstagram.description AS description," +
                    "attachment.url AS url," +
                    "attachment.url2 AS url2," +
                    "attachment.url3 AS url3," +
                    "member.nickname AS nickname," +
                    "member.id AS user_id," +
                    "member.profile_url AS profile_url," +
                    "dogstagram_like.nickname AS last_liked_nickname," +
                    "dogstagram.created_at AS created_at," +
                    "(SELECT COUNT(m.id) AS total_like FROM dogstagram_like m WHERE m.dogstagram_id = dogstagram.id) AS total_like," +
                    "EXISTS(select dogstagram_like.id" +
                    "                from dogstagram_like" +
                    "                where dogstagram_like.user_id = :id" +
                    "            ) AS is_liked, dogstagram.created_at AS created_at " +
                    "FROM dogstagram dogstagram " +
                    "INNER JOIN attachment attachment ON dogstagram.id = attachment.dogstagram_id " +
                    "INNER JOIN member member ON member.id = dogstagram.member_id " +
                    "LEFT JOIN (SELECT (select nickname from member where id = :id) as nickname," +
                    "               dogstagram_id" +
                    "           FROM dogstagram_like dogstagram_like ORDER BY dogstagram_like.created_at DESC) dogstagram_like" +
                    "           ON dogstagram_like.dogstagram_id = dogstagram.id " +
                    "ORDER BY total_like DESC, created_at DESC " +
                    "LIMIT 4 ", nativeQuery = true)
    public List<IDogstagram> getStarDogstagramList(@Param(value = "id") Long id);
}
