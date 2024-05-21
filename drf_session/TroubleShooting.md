## 트러블 슈팅
### 과제2
코드들을 잘 짰는데도 Page not found (404)가 떴다.  
```python
# config urls.py
path('api/posts/', include('posts.urls', namespace='posts'))

# posts urls.py
path('api/posts/list', PostListView.as_view()),
```
config/urls.py에서 `api/posts/`를 namespace로 posts라고 설정했기 때문에  
posts/urls.py에서 `list/` 경로만 추가해야 최종적으로  
`http://127.0.0.1:8000/api/posts/list/` 경로가 된다.  

namespace란? (**좀 더 찾아보삼**)
- 객체를 구분할 수 있는 범위를 나타내는 말
- 모든 변수명과 함수명 등이 겹치치 않게 정의하는 건 어려움  
-> 장고에선 서로 다른 app의 같은 이름을 가진 url name은 namespace를 설정해서 구분
