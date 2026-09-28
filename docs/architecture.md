# StaySphere Architecture

## Architecture Style

StaySphere uses a microservices architecture.

## Frontend

React.js provides:

- Customer interface
- Hotel search
- Room selection
- Booking
- Payment
- Customer account
- Admin dashboard

## API Gateway

The API Gateway is the main entry point for frontend API requests.

## Business Microservices

### Auth Service

Responsible for:

- Registration
- Login
- JWT
- Spring Security
- Authorization
- Refresh tokens
- Password reset

### Hotel Service

Responsible for:

- Hotels
- Rooms
- Amenities
- Pricing
- Availability

### Booking Service

Responsible for:

- Booking creation
- Room allocation
- Booking lifecycle
- Cancellation
- Booking history

### Payment Service

Responsible for:

- Razorpay order creation
- Payment verification
- Payment status
- Refund processing

### Coupon Service

Responsible for:

- Coupon creation
- Coupon validation
- Discount calculation
- Coupon usage

### Notification Service

Responsible for:

- Email
- SMS
- Booking notifications
- Payment notifications
- Invoice notifications

## Infrastructure

- Service Registry
- Config Server
- Redis

## Database

Each business microservice owns its database.

## External Services

- Razorpay
- Email provider
- SMS provider