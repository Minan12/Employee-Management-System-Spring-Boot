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

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author bondopangaji
 *
 */

@Entity
@Table(name = "payroll")
public class Payroll {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "payroll_id")
	private long payrollId;
	
	@ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "employee_id")
	private Employee employee;
	
	@Column(name = "payroll_date")
	private String payrollDate;
	
	@Column(name = "hourly_rate")
	private long hourlyRate;
	
	@Column(name = "annual_salary")
	private long annualSalary;

	@Column(name = "tax")
	private int tax;
	
	@Column(name = "net_salary")
	private int netSalary;


	public Payroll() {
		super();
	}


	/**
	 * @param payrollId
	 * @param employee
	 * @param payrollDate
	 * @param hourlyRate
	 * @param annualSalary
	 * @param tax
	 * @param netSalary
	 */
	public Payroll(long payrollId, Employee employee, String payrollDate, long hourlyRate, long annualSalary, int tax,
			int netSalary) {
		super();
		this.payrollId = payrollId;
		this.employee = employee;
		this.payrollDate = payrollDate;
		this.hourlyRate = hourlyRate;
		this.annualSalary = annualSalary;
		this.tax = tax;
		this.netSalary = netSalary;
	}


	/**
	 * @return the payrollId
	 */
	public long getPayrollId() {
		return payrollId;
	}


	/**
	 * @param payrollId the payrollId to set
	 */
	public void setPayrollId(long payrollId) {
		this.payrollId = payrollId;
	}


	/**
	 * @return the employee
	 */
	public Employee getEmployee() {
		return employee;
	}


	/**
	 * @param employee the employee to set
	 */
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}


	/**
	 * @return the payrollDate
	 */
	public String getPayrollDate() {
		return payrollDate;
	}


	/**
	 * @param payrollDate the payrollDate to set
	 */
	public void setPayrollDate(String payrollDate) {
		this.payrollDate = payrollDate;
	}


	/**
	 * @return the hourlyRate
	 */
	public long getHourlyRate() {
		return hourlyRate;
	}


	/**
	 * @param hourlyRate the hourlyRate to set
	 */
	public void setHourlyRate(long hourlyRate) {
		this.hourlyRate = hourlyRate;
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
