import requests
import json
import pymysql

mysql_host = 'localhost'
mysql_db = 'schools'
mysql_user = 'hcq'
mysql_pwd = '123456'
mysql_table = 'university'

url = 'https://www.cingta.com/school/api/name_uni_list/'

wbdata = requests.get(url).text
data = json.loads(wbdata)

schools = data['data']['list']
# print(schools)
for n in schools:

    lineid = n['lineid']
    code = n['code']
    schoolname = n['schoolname']
    province = n['province']
    city = n['city']
    department = n['department']
    level = n['level']
    type = n['type']
    link = n['link']


    print(lineid,code,schoolname,province,city,department,level,type,link)
    class MYSQL:
        def __init__(self):
            # MySQL
            self.MYSQL_HOST = mysql_host
            self.MYSQL_DB = mysql_db
            self.MYSQ_USER = mysql_user
            self.MYSQL_PWD = mysql_pwd
            self.connect = pymysql.connect(
                host=self.MYSQL_HOST,
                db=self.MYSQL_DB,
                port=3306,
                user=self.MYSQ_USER,
                passwd=self.MYSQL_PWD,
                charset='utf8',
                use_unicode=False
            )
            # print(self.connect)
            self.cursor = self.connect.cursor()

            # 插入数据
            sql = 'insert into university(lineid, code, schoolname, province, department, city, level, type, link) values(%s,%s,%s,%s,%s,%s,%s,%s,%s)'
            try:
                self.cursor.execute(sql, (lineid, code, schoolname, province, department, city, level, type, link))
                self.connect.commit()
                # print('数据插入成功')
            except Exception as e:
                print('e= ', e)
                print('数据插入错误')
    def main():
        MYSQL()

    if __name__ == '__main__':
        main()