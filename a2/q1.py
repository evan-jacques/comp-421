import psycopg2
try:
	con_str = "dbname='CS421' user='ejacqu6' host='db2.cs.mcgill.ca' password='golf2004'"
	conn = psycopg2.connect(con_str)
except:
	print "I am unable to connect to the database"

cur = conn.cursor()
cur.execute("""CREATE TABLE test (
	id int,
	name varchar(255))""")
