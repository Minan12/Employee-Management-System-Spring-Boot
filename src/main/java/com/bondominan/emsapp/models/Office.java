/**

MIT License

Copyright (c) [2021] [bondopangaji]

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

**/

package com.bondominan.emsapp.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author bondopangaji
 *
 */

@Entity
@Table(name = "OFFICE")
public class Office {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "OFFICE_ID")
	private long officeID;
	
	@Column(name = "DEPARTMENT_ID")
	private long department_ID;	
	
	@Column(name = "PAYROLL_ID")
	private long payrollID;	
	
	@Column(name = "WORK POSITION")
	private String username;
	
	@Column(name = "DATE_EMPLOYED_FROM")
	private Date dateEmployedFrom;
	
	@Column(name = "DATE_EMPLOYED_TO")
	private Date dateEmployedTo;
	
	@Column(name = "EMPLOYMENT_STATUS")
	private String employmentStatus;

	/**
	 * @return the officeID
	 */
	public long getOfficeID() {
		return officeID;
	}

	/**
	 * @param officeID the officeID to set
	 */
	public void setOfficeID(long officeID) {
		this.officeID = officeID;
	}

	/**
	 * @return the department_ID
	 */
	public long getDepartment_ID() {
		return department_ID;
	}

	/**
	 * @param department_ID the department_ID to set
	 */
	public void setDepartment_ID(long department_ID) {
		this.department_ID = department_ID;
	}

	/**
	 * @return the payrollID
	 */
	public long getPayrollID() {
		return payrollID;
	}

	/**
	 * @param payrollID the payrollID to set
	 */
	public void setPayrollID(long payrollID) {
		this.payrollID = payrollID;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the dateEmployedFrom
	 */
	public Date getDateEmployedFrom() {
		return dateEmployedFrom;
	}

	/**
	 * @param dateEmployedFrom the dateEmployedFrom to set
	 */
	public void setDateEmployedFrom(Date dateEmployedFrom) {
		this.dateEmployedFrom = dateEmployedFrom;
	}

	/**
	 * @return the dateEmployedTo
	 */
	public Date getDateEmployedTo() {
		return dateEmployedTo;
	}

	/**
	 * @param dateEmployedTo the dateEmployedTo to set
	 */
	public void setDateEmployedTo(Date dateEmployedTo) {
		this.dateEmployedTo = dateEmployedTo;
	}

	/**
	 * @return the employmentStatus
	 */
	public String getEmploymentStatus() {
		return employmentStatus;
	}

	/**
	 * @param employmentStatus the employmentStatus to set
	 */
	public void setEmploymentStatus(String employmentStatus) {
		this.employmentStatus = employmentStatus;
	}
	
}
