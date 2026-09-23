# Hotel Booking System Architecture

## Architecture Style

The Hotel Booking System uses a microservices architecture.

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

The API Gateway acts as the single entry point for frontend API requests.

## Business Microservices

### Auth Service

Responsible for:

- User registration
- Login
- JWT
- Authorization
- Refresh tokens
- Password reset

### Hotel Service

Responsible for:

- Hotels
- Rooms
- Amenities
- Room pricing
- Room availability

### Booking Service

Responsible for:

- Booking creation
- Booking lifecycle
- Room allocation
- Booking cancellation

### Payment Service

Responsible for:

- Payment order creation
- Payment verification
- Payment status
- Refund processing

### Coupon Service

Responsible for:

- Coupon creation
- Coupon validation
- Coupon usage

### Notification Service

Responsible for:

- Email notifications
- SMS notifications

## Infrastructure

### Service Registry

Provides service discovery.

### Config Server

Provides centralized configuration.

## Database

Each business microservice owns its database.

## External Services

- Razorpay
- Email provider
- SMS provider