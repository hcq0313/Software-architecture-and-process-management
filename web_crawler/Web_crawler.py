import requests
import json

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

