# syntax=docker/dockerfile:1

FROM python:3.8-slim-buster

WORKDIR /app
RUN echo 'nameserver 8.8.8.8'>/etc/resolv.conf
COPY requirements.txt requirements.txt
RUN pip3 install -r requirements.txt

COPY . .

CMD [ "python3", "-m" , "flask", "run", "--host=0.0.0.0"]

