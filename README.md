# S-A
https://github.com/TechPrimers/jenkins-example

Hello world.

http://toolsqa.com/selenium-webdriver/selenium-webdriver-basics-video-tutorials/


Devops

https://www.youtube.com/watch?v=PxGGeNEdb3E&list=PLfrfJVGVwh-OVWKj4k0gzFFfLaLf-WzQ5


Selenium docker in aws

http://www.tjmaher.com/2018/03/starting-selenium-grid-using-aws.html
http://www.testautomationguru.com/selenium-grid-setup-using-docker/


tickers1 = ['TRENT', 'TATAMOTORS']#, 'ABFRL','GUJGASLTD', 'GAIL']
tickers2 = ['MARICO']#, 'DEEPAKNTR', 'TATASTEEL']#, 'TATAELXSI']

{'Global Quote': {'01. symbol': 'NSE:MARICO', '02. open': '337.7000', '03. high': '337.9000', '04. low': '332.3000', '05. price': '334.6500', '06. volume': '915065', '07. latest trading day': '2020-01-22', '08. previous close': '336.7500', '09. change': '-2.1000', '10. change percent': '-0.6236%'}}
MARICO ('337.7000', '337.9000', '332.3000', '334.6500', '336.7500', '915065')
{'Global Quote': {'01. symbol': 'NSE:TRENT', '02. open': '603.9500', '03. high': '605.0000', '04. low': '582.2000', '05. price': '586.2000', '06. volume': '71954', '07. latest trading day': '2020-01-22', '08. previous close': '594.3000', '09. change': '-8.1000', '10. change percent': '-1.3629%'}}
TRENT ('603.9500', '605.0000', '582.2000', '586.2000', '594.3000', '71954')



{'1. open': '564.6000', '2. high': '565.0000', '3. low': '547.0000', '4. close': '549.4500', '5. volume': '2284062'}
{'1. open': '548.0000', '2. high': '566.0000', '3. low': '546.0500', '4. close': '563.2500', '5. volume': '2165041'}
{'1. open': '550.0000', '2. high': '550.0000', '3. low': '539.4000', '4. close': '547.4500', '5. volume': '1100087'}
{'1. open': '530.0000', '2. high': '545.9500', '3. low': '530.0000', '4. close': '543.8500', '5. volume': '2977229'}
{'1. open': '510.8500', '2. high': '534.0000', '3. low': '509.2000', '4. close': '529.7000', '5. volume': '1965408'}
{'1. open': '514.2000', '2. high': '514.2500', '3. low': '507.0500', '4. close': '508.9000', '5. volume': '739156'}
{'1. open': '508.5000', '2. high': '514.5000', '3. low': '506.1000', '4. close': '512.3500', '5. volume': '920431'}
{'1. open': '502.5000', '2. high': '510.0000', '3. low': '500.0500', '4. close': '508.5000', '5. volume': '1054278'}
{'1. open': '482.2500', '2. high': '496.8500', '3. low': '482.2500', '4. close': '495.1000', '5. volume': '1012107'}
{'1. open': '491.9500', '2. high': '502.5000', '3. low': '490.6500', '4. close': '494.4000', '5. volume': '925690'}
{'1. open': '503.0000', '2. high': '504.9000', '3. low': '487.3500', '4. close': '490.2000', '5. volume': '1450134'}
{'1. open': '509.0500', '2. high': '513.4500', '3. low': '505.6500', '4. close': '509.8000', '5. volume': '888973'}
{'1. open': '517.9500', '2. high': '518.8500', '3. low': '509.2000', '4. close': '511.6500', '5. volume': '687697'}
{'1. open': '515.5500', '2. high': '521.6500', '3. low': '515.3000', '4. close': '517.4500', '5. volume': '606573'}
{'1. open': '516.0000', '2. high': '516.7000', '3. low': '510.5000', '4. close': '515.5500', '5. volume': '568561'}
{'1. open': '514.3000', '2. high': '520.0000', '3. low': '513.0500', '4. close': '515.2000', '5. volume': '478537'}
    # format
    str_raw_json = response.json()

    keys = str_raw_json.keys()
    values = str_raw_json.values()

    keys = str_raw_json.keys()
    values = str_raw_json.values()

    # printing keys and values separately
    # print("keys : ", str(keys))
    # print("values : ", str(values))

    for item in str_raw_json.values():
        opn = item['02. open']
        hgh = item['03. high']
        lw = item['04. low']
        cp = item['05. price']
        pc = item['08. previous close']
        vol = item['06. volume']
    return opn, hgh, lw, cp, pc, vol

 for item in tickers1:
        # print(item)
        print(item, mt_ticker(item, api_key))
