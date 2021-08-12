package com.twokeys.twokeysapi.entities.pk;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class AccountsReceivablePK implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long document;
	private String parcel;
	
	public AccountsReceivablePK() {
	}

	public AccountsReceivablePK(Long document, String parcel) {
		this.document = document;
		this.parcel = parcel;
	}

	public Long getDocument() {
		return document;
	}

	public void setDocument(Long document) {
		this.document = document;
	}

	public String getParcel() {
		return parcel;
	}

	public void setParcel(String parcel) {
		this.parcel = parcel;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((document == null) ? 0 : document.hashCode());
		result = prime * result + ((parcel == null) ? 0 : parcel.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AccountsReceivablePK other = (AccountsReceivablePK) obj;
		if (document == null) {
			if (other.document != null)
				return false;
		} else if (!document.equals(other.document))
			return false;
		if (parcel == null) {
			if (other.parcel != null)
				return false;
		} else if (!parcel.equals(other.parcel))
			return false;
		return true;
	}
}
