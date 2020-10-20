select first_name||' '||last_name as 이름,
        salary as 월급,
        phone_number 전화번호,
        hire_date 입사일
from employees
order by hire_date asc;

--업무별로 업무이름과 최고임금
select job_title,
        max_salary
from jobs
order by max_salary desc;

--정확하지않지만 지사가 있을것으로 예상되는 나라들을 나라이름을 대문자로 출력하고 오름차순으로 정렬해 보세요
select upper(country_name)
from countries
order by 1 desc;

--마지막으로 신입사원이 들어온날은 언제 입니까? 다음 형식으로 출력해주세요.
select to_char(max(hire_date), 'yyyy"년"mm"월"dd"일"')
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
            
--평균 임금과 최저임금의 차이가 2000미만인 부서 평균임금 최저임금 그리고 평균임금-최저임금을 평균임금-최저임금의 내림차순으로 정렬해서 출력하세요
select department_id, round(avg(salary),1), min(salary), round(avg(salary)-min(salary), 1) re
from employees
group by department_id
having avg(salary)-min(salary) < 2000
order by avg(salary)-min(salary) desc;

select emp.employee_id "사원",
        emp.first_name "이름",
        dep.department_name as "부서명",
        mag.first_name as "매니저이름"
        from employees emp, departments dep, employees mag
        where emp.department_id = dep.department_id
        and emp.manager_id = mag.employee_id;
        
select dep.department_id as "부서번호",
       dep.department_name as "부서이름",
       emp.first_name as "매니저이름",
       loc.city as "위치한도시",
       cou.country_name as "나라이름",
       reg.region_name as "지역명"
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

--자신의매니저보다 채용일이 빠른 사원의 사번과 채용일을 조회하세요
select e.employee_id, e.last_name, e.hire_date, m.last_name, m.hire_date
from employees e , employees m
where e.manager_id = m.employee_id
and e.hire_date < m.hire_date;

--평균연봉보다작은 사원
select count(*)
from employees e
where e.salary<(select avg(salary) from employees);

--각부서별 최고의 급여를 받는 사원의 사번 성 연봉을 조회하세요 단 조회결과는 연봉의 내림차순으로 정ㄹㄹ되어 나타나야 합니다.
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

--자신의부서 평균 급여보다 연봉이 많은 사원의 사번과 연봉을 조회
select e.department_id, e.employee_id, e.last_name, e.salary
from employees e,
    (
    select avg(salary) avg_salary, department_id
    from employees
    group by department_id
    ) s
where e.department_id = s.department_id
and e.salary > s.avg_salary;

--가장 늦게 입사한 직원의 이름

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

select e.employee_id, e.first_name||' '||e.last_name "이름"
from employees e, job_history jh, jobs j
where e.job_id = j.job_id and j.job_id = jh.job_id and j.job_title = 'Public Accountant';