-- Insert one demo week
INSERT INTO weeks (id, week_number, start_date, end_date) VALUES
(1, 1, '2026-03-30', '2026-04-05');

-- DATA STRUCTURES
INSERT INTO tasks (id, task_name, task_body, day_of_task, date_of_task, time_of_task, end_time_of_task, week_id) VALUES
(1, 'Data Structures', 'Lecture', 'Monday', '2026-03-30', '11:15:00','12:15:00', 1),
(2, 'Data Structures', 'Lecture', 'Tuesday', '2026-03-31', '11:15:00','12:15:00', 1);

-- PHYSICS
INSERT INTO tasks (id, task_name, task_body, day_of_task, date_of_task, time_of_task, end_time_of_task, week_id) VALUES
(3, 'Physics', 'Lecture', 'Monday', '2026-03-30', '12:15:00','13:15:00', 1),
(4, 'Physics', 'Lecture', 'Tuesday', '2026-03-31', '12:15:00','13:15:00', 1);

-- OOP
INSERT INTO tasks (id, task_name, task_body, day_of_task, date_of_task, time_of_task, end_time_of_task, week_id) VALUES
(5, 'Object Oriented Programming', 'Lecture', 'Tuesday', '2026-03-31', '09:00:00','11:00:00', 1),
(6, 'Object Oriented Programming', 'Lecture', 'Wednesday', '2026-04-01', '11:15:00','13:15:00', 1);

-- COA
INSERT INTO tasks (id, task_name, task_body, day_of_task, date_of_task, time_of_task, end_time_of_task, week_id) VALUES
(7, 'Computer Organization and Architecture', 'Lecture', 'Tuesday', '2026-03-31', '13:45:00','14:45:00', 1),
(8, 'Computer Organization and Architecture', 'Lecture', 'Wednesday', '2026-04-01', '14:45:00','15:45:00', 1),
(9, 'Computer Organization and Architecture', 'Lecture', 'Friday', '2026-04-03', '12:15:00','13:15:00', 1);

-- MATH
INSERT INTO tasks (id, task_name, task_body, day_of_task, date_of_task, time_of_task, end_time_of_task, week_id) VALUES
(10, 'Engineering Mathematics 2', 'Lecture', 'Wednesday', '2026-04-01', '13:45:00','14:45:00', 1),
(11, 'Engineering Mathematics 2', 'Lecture', 'Thursday', '2026-04-02', '13:45:00','14:45:00', 1),
(12, 'Engineering Mathematics 2', 'Lecture', 'Friday', '2026-04-03', '11:15:00','12:15:00', 1);