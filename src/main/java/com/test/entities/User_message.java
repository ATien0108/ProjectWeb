package com.test.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user_message")
public class User_message {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "message")
	private String message;
	@Column(name = "sourceId", nullable = false)
	private int sourceId;
	@Column(name = "targetId", nullable = false)
	private int targetId;
	@Column(name = "createdAt", nullable = false)
	private String createdAt;
	@Column(name = "updatedAt", nullable = true)
	private String updatedAt;

	public User_message() {
		super();
	}

	public User_message(int id, String message, int sourceId, int targetId, String createdAt, String updatedAt) {
		super();
		this.id = id;
		this.message = message;
		this.sourceId = sourceId;
		this.targetId = targetId;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getSourceId() {
		return sourceId;
	}

	public void setSourceId(int sourceId) {
		this.sourceId = sourceId;
	}

	public int getTargetId() {
		return targetId;
	}

	public void setTargetId(int targetId) {
		this.targetId = targetId;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

}
