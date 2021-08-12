package com.twokeys.twokeysapi.dto;

import java.io.Serializable;

import com.twokeys.twokeysapi.entities.FormPayment;

public class FormPaymentDTO implements Serializable {
			private static final long serialVersionUID = 1L;
			
			private String id;
			private String name;
			
			public FormPaymentDTO() {
			}

			public FormPaymentDTO(String id, String name) {
				this.id = id;
				this.name = name;
			}

			public FormPaymentDTO(FormPayment entity) {
				id = entity.getId();
				name = entity.getName();
			}

			public String getId() {
				return id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}
}
