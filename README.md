# Session 13 - Bai 4: API Gateway routing

Yeu cau JDK 21 va Docker. Chay `docker compose up -d --wait`, `./gradlew :identity-service:bootRun` va `./gradlew :gateway-service:bootRun` o hai terminal.

Gateway cong 8888. `POST http://localhost:8888/identity/api/auth/register` va `POST http://localhost:8888/identity/api/auth/login` duoc chuyen den Identity cong 8080. `GET http://localhost:8888/products/api/products` duoc chuyen den API product mo phong trong Identity. Ca hai route dung `Path` va `StripPrefix=1`. Bai 6 se tach product thanh service rieng.
