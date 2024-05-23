from django.urls import path, include
from .views import *

app_name = 'posts'

urlpatterns = [
    path('post/', PostAPIView.as_view()),
    # path('post/', PostAPIView2.as_view()),
    # path('post/', PostAPI_FBV),
    # path('api/posts/list', PostListView.as_view(), name='post-list'),
    # path('list/', PostListView.as_view()),
    path('comment/', CommentCreateView)
]