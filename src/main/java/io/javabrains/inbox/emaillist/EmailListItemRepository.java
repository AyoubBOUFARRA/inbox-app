package io.javabrains.inbox.emaillist;

import java.util.List;

import org.springframework.data.cassandra.repository.CassandraRepository;

import io.javabrains.inbox.folders.Folder;

public interface EmailListItemRepository extends CassandraRepository<EmailListItem, EmailListItemKey>{

	List<EmailListItem> findAllByKey_IdAndKey_Label(String id, String label);
}
