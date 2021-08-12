package com.twokeys.twokeysapi.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_payment_plan")
public class PaymentPlan implements Serializable {
		private static final long serialVersionUID = 1L;
		
		@Id
		private Long id;
		private String name;
		private Double financialRate;
		private Integer averageTime;
		private Integer parcelsNumber;
		private Integer firstInterval;
		private Integer parcelsInterval;
		
		public PaymentPlan() {
		}

		public PaymentPlan(Long id, String name, Double financialRate, Integer averageTime, Integer parcelsNumber,
						   Integer firstInterval, Integer parcelsInterval) {
			this.id = id;
			this.name = name;
			this.financialRate = financialRate;
			this.averageTime = averageTime;
			this.parcelsNumber = parcelsNumber;
			this.firstInterval = firstInterval;
			this.parcelsInterval = parcelsInterval;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Double getFinancialRate() {
			return financialRate;
		}

		public void setFinancialRate(Double financialRate) {
			this.financialRate = financialRate;
		}

		public Integer getAverageTime() {
			return averageTime;
		}

		public void setAverageTime(Integer averageTime) {
			this.averageTime = averageTime;
		}

		public Integer getParcelsNumber() {
			return parcelsNumber;
		}

		public void setParcelsNumber(Integer parcelsNumber) {
			this.parcelsNumber = parcelsNumber;
		}

		public Integer getFirstInterval() {
			return firstInterval;
		}

		public void setFirstInterval(Integer firstInterval) {
			this.firstInterval = firstInterval;
		}

		public Integer getParcelsInterval() {
			return parcelsInterval;
		}

		public void setParcelsInterval(Integer parcelsInterval) {
			this.parcelsInterval = parcelsInterval;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((id == null) ? 0 : id.hashCode());
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
			PaymentPlan other = (PaymentPlan) obj;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			return true;
		}
}
