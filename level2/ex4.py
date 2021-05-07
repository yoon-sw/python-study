# pandas 설치
# python -m pip install pandas
#
#import sys
# print(sys.path) 경로에 설치


import sys
import pandas as pd

# print(sys.path)

result = [
    {"id": 1, "name": "홍릭동"},
    {"id": 2, "name": "홍릭동"},
    {"id": 3, "name": "홍릭동"}
]

print(result)
print("==="*50)

pandas_result = pd.DataFrame(result)

print(pandas_result)
print("==="*50)

pandas_result = pd.DataFrame(result, index=["first", "second", "third"])
print(pandas_result)
print("==="*50)
