CREATE extension IF NOT EXISTS pgcrypto;
CREATE TABLE m2pdf_report
(
 	id UUID PRIMARY KEY,
  	markdown text NOT NULL,
  	description text
);