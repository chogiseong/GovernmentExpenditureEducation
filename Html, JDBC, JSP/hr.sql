select first_name||' '||last_name as �̸�,
        salary as ����,
        phone_number ��ȭ��ȣ,
        hire_date �Ի���
from employees
order by hire_date asc;

--�������� �����̸��� �ְ��ӱ�
select job_title,
        max_salary
from jobs
order by max_salary desc;

--��Ȯ���������� ���簡 ���������� ����Ǵ� ������� �����̸��� �빮�ڷ� ����ϰ� ������������ ������ ������
select upper(country_name)
from countries
order by 1 desc;

--���������� ���Ի���� ���³��� ���� �Դϱ�? ���� �������� ������ּ���.
select to_char(max(hire_date), 'yyyy"��"mm"��"dd"��"')
from employees;


select avg(salary),
        max(salary),
        min(salary),
        job_id
from employees
group by job_id
order by avg(salary) desc,
            max(salary) desc,
            min(salary) desc;
            
--��� �ӱݰ� �����ӱ��� ���̰� 2000�̸��� �μ� ����ӱ� �����ӱ� �׸��� ����ӱ�-�����ӱ��� ����ӱ�-�����ӱ��� ������������ �����ؼ� ����ϼ���
select department_id, round(avg(salary),1), min(salary), round(avg(salary)-min(salary), 1) re
from employees
group by department_id
having avg(salary)-min(salary) < 2000
order by avg(salary)-min(salary) desc;

select emp.employee_id "���",
        emp.first_name "�̸�",
        dep.department_name as "�μ���",
        mag.first_name as "�Ŵ����̸�"
        from employees emp, departments dep, employees mag
        where emp.department_id = dep.department_id
        and emp.manager_id = mag.employee_id;
        
select dep.department_id as "�μ���ȣ",
       dep.department_name as "�μ��̸�",
       emp.first_name as "�Ŵ����̸�",
       loc.city as "��ġ�ѵ���",
       cou.country_name as "�����̸�",
       reg.region_name as "������"
from departments dep,
     employees emp,
     locations loc,
     countries cou,
     regions reg
where dep.manager_id = emp.employee_id
and dep.location_id = loc.location_id
and loc.country_id = cou.country_id
and cou.region_id = reg.region_id
order by dep.department_id asc;

--�ڽ��ǸŴ������� ä������ ���� ����� ����� ä������ ��ȸ�ϼ���
select e.employee_id, e.last_name, e.hire_date, m.last_name, m.hire_date
from employees e , employees m
where e.manager_id = m.employee_id
and e.hire_date < m.hire_date;

--��տ����������� ���
select count(*)
from employees e
where e.salary<(select avg(salary) from employees);

--���μ��� �ְ��� �޿��� �޴� ����� ��� �� ������ ��ȸ�ϼ��� �� ��ȸ����� ������ ������������ �������Ǿ� ��Ÿ���� �մϴ�.
select e.employee_id, e.last_name, e.salary, e.department_id
from employees e,
    (
    select max(salary) salary, department_id
    from employees
    group by department_id
    ) m
where e.salary = m.salary
and e.department_id = m.department_id
order by e.salary desc;

--�ڽ��Ǻμ� ��� �޿����� ������ ���� ����� ����� ������ ��ȸ
select e.department_id, e.employee_id, e.last_name, e.salary
from employees e,
    (
    select avg(salary) avg_salary, department_id
    from employees
    group by department_id
    ) s
where e.department_id = s.department_id
and e.salary > s.avg_salary;

--���� �ʰ� �Ի��� ������ �̸�

select * from locations;

select r.region_name, avg(salary)
from employees e,
    departments d,
    locations l,
    countries c,
    regions r
where e.department_id = d.department_id
and d.location_id = l.location_id
and l.country_id = c.country_id
and c.region_id = r.region_id
group by r.region_id, r.region_name
having avg(salary) =(select max(avg(salary))
                from employees e,
                    departments d,
                    locations l,
                    countries c,
                    regions r
                    where e.department_id = d.department_id
                    and d.location_id = l.location_id
                    and l.country_id = c.country_id
                    and c.region_id = r.region_id
                    group by r.region_id);
                    
select * from employees;
select * from jobs;
select * from job_history;

select e.employee_id, e.first_name||' '||e.last_name "�̸�"
from employees e, job_history jh, jobs j
where e.job_id = j.job_id and j.job_id = jh.job_id and j.job_title = 'Public Accountant';