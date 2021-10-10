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

package com.bondominan.emsapp.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.bondominan.emsapp.interfaces.PayrollInterface;
import com.bondominan.emsapp.models.Payroll;

/**
 * @author bondopangaji
 *
 */

@Controller
public class EmployeeDashboardController {
	
	@Autowired
	PayrollInterface payrollInterface;

	@GetMapping
	("/employee-dashboard")
	public String adminDashboardView() {
		return "/employee-dashboard/dashboard";
	}
	
	@GetMapping
	("/employee-dashboard/my-details")
	public String myDetailsView() {
		return "/employee-dashboard/my-detail";
	}
	
	@GetMapping
	("/admin-dashboard/edit-payroll/{payrollId}")
	public String adminDashboardEditPayroll(@PathVariable(value = "payrollId") long payrollId, Model model) {
		Payroll payroll = payrollInterface.getDataById(payrollId);

        model.addAttribute("payroll", payroll);
		return "/admin-dashboard/edit-payroll";
	}
	
	@GetMapping
	("/employee-dashboard/my-payroll")
	public String myPayrollView() {
		return "/employee-dashboard/my-payroll";
	}
	
	/**
	 * 
	 * nothing
	 */
	
	@GetMapping
	("/employee-dashboard/invoice")
	public String invoice() {
		return "/employee-dashboard/invoice";
	}
	
	@GetMapping
	("/employee-dashboard/invoice-print")
	public String ip() {
		return "/employee-dashboard/invoice-print";
	}
}
