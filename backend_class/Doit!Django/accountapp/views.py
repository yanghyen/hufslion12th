from django.http import HttpResponse
from django.shortcuts import render
# from rest_framework.response import Response
# from rest_framework.decorators import api_view

# Create your views here.
# 기존 장고 방식
def hello_world(request):
  return HttpResponse('Hello_world') 

# DRF 방식 (딕셔너리 형태로 값)
'''
@api_view()
def hello_world_drf(request):
  return Response("message":"Hello world")
'''