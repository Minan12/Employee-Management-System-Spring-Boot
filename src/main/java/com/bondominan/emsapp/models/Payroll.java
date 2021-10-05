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
@Table(name = "PAYROLL")
public class Payroll {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PAYROLL_ID")
	private long payrollID;

	@Column(name = "EMPLOYEE_ID")
	private long employeeID;

	@Column(name = "PAYROLL_DATE")
	private Date payrollDate;
	
	@Column(name = "HOURLY_RATE")
	private long hourlyRate;
	
	@Column(name = "ANNUAL_SALARY")
	private long annualSalary;

	@Column(name = "TAX")
	private int tax;
	
	@Column(name = "NET_SALARY")
	private int netSalary;

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
	 * @return the employeeID
	 */
	public long getEmployeeID() {
		return employeeID;
	}

	/**
	 * @param employeeID the employeeID to set
	 */
	public void setEmployeeID(long employeeID) {
		this.employeeID = employeeID;
	}

	/**
	 * @return the payrollDate
	 */
	public Date getPayrollDate() {
		return payrollDate;
	}

	/**
	 * @param payrollDate the payrollDate to set
	 */
	public void setPayrollDate(Date payrollDate) {
		this.payrollDate = payrollDate;
	}

	/**
	 * @return the annualSalary
	 */
	public long getAnnualSalary() {
		return annualSalary;
	}

	/**
	 * @param annualSalary the annualSalary to set
	 */
	public void setAnnualSalary(long annualSalary) {
		this.annualSalary = annualSalary;
	}

	/**
	 * @return the tax
	 */
	public int getTax() {
		return tax;
	}

	/**
	 * @param tax the tax to set
	 */
	public void setTax(int tax) {
		this.tax = tax;
	}

	/**
	 * @return the netSalary
	 */
	public int getNetSalary() {
		return netSalary;
	}

	/**
	 * @param netSalary the netSalary to set
	 */
	public void setNetSalary(int netSalary) {
		this.netSalary = netSalary;
	}
	
}
