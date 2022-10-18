import React, { Component } from 'react'
import axios from "axios";

class RiderRegister extends Component {
  constructor() {
    super();
    this.state = {

      "email": '',
      "name": '',
      "address": '',
      "phone": '',
      "serviceduration": '',
      "vehiclenum": '',
      "password": '',
      "role": '',
    }
  }

  emailChange = (event) => {
    //alert(event.target.value);
    this.setState({
      email: event.target.value
    })
  }

  nameChange = (event) => {
    //alert(event.target.value);
    this.setState({
      name: event.target.value
    })
  }
  addressChange = (event) => {
    //alert(event.target.value);
    this.setState({
      address: event.target.value
    })
  }
  phoneChange = (event) => {
    //alert(event.target.value);
    this.setState({
      phone: event.target.value
    })
  }
 
  servicedurationChange = (event) => {
    //alert(event.target.value);
    this.setState({
      serviceduration: event.target.value
    })
  }
  vehiclenumChange = (event) => {
    this.setState({
      vehiclenum: event.target.value
    })
  }
  passwordChange = (event) => {
    this.setState({
      password: event.target.value
    })
  }

  roleChange = (event) => {
    this.setState({
      role: event.target.value
    })
  }

  addRider = (event) => {

    axios.post('register', this.state)
      .then((res) => {
        this.callMain()
      })
      .catch(err => console.log(err))
    event.preventDefault();
  }

  authRider = (event) => {
    axios.post('authenticate', this.state)
      .then((res) => {
        this.callForRiderDashboard()
      })
      .catch((err) => console.log(err))

    event.preventDefault();

  }

  callForRiderDashboard() {

    this.props.history.push({
      pathname: '/riderdashboard',
      state: { detail: this.state.email }
    })

  }
  render() {
    return (

      <div>
         <div>
          <nav>
            <a href="home.html">
              <img src="./images/logo.png" class="logo" />
            </a>
            <label for="btn" class="icon">
              <span class="fa fa-bars"></span>
            </label>

            <ul>
              <li><a href="/">Home</a></li>
              <li><a href="/campaigns">Campaigns</a></li>
              <li><a href="#">About us</a></li>
              <li><a href="/contactus">Contact</a></li>
              <li>

                <a href="#">Register/login</a>

                <ul >
                  <li><a href="/mregister">Member</a></li>
                  <li><a href="cregister">Caregiver</a></li>
                  <li><a href="pregister">Partner</a></li>
                  <li><a href="rregister">Rider</a></li>
                  <li><a href="adminlogin">Admin</a></li>
                </ul>
              </li>
            </ul>
          </nav>
        </div>

        <div class="rregistration">
          <center> <h1>
            <span3><span>Rider</span><span2>Login/Registration </span2></span3>
          </h1>

          </center>
          <div class="container">
            <input type="checkbox" id="flip" />
            <div class="cover">
              <div class="front">
                <img src="./images/frontImg.jpg" alt="" />
                <div class="text">
                  <span class="text-1">Every new friend is a <br /> new adventure</span>
                  <span class="text-2">Let's get connected</span>
                </div>
              </div>

            </div>

            <div class="forms">
              <div class="form-content">
                <div class="login-form">
                  <div class="title">Login</div>
                  <form onSubmit={this.authRider}>
                    <div class="input-boxes">
                      <div class="input-box">

                        <input type="email" className="form-control" placeholder="Email"
                          value={this.state.email} onChange={this.emailChange} required/>
                      </div>
                      <br />
                      <div class="input-box">
                        <i class="fas fa-lock"></i>
                        <input type="password" className="form-control" placeholder="Password"
                          value={this.state.password} onChange={this.passwordChange} required/>
                      </div>

                      <div class="text"><a href="#">Forgot password?</a></div>
                      <div class="button input-box">
                        <button className="btn btn-warning btn-block">Sign in</button>
                      </div>
                      <div class="text sign-up-text">Don't have an account? <label for="flip">Sigup now</label></div>

                    </div>
                  </form>
                </div>
                <div class="signup-form">
                  <div class="title">Sign up</div>
                  <form class="reg" onSubmit={this.addRider}>
                    <div class="input-boxes">
                    <div class="input-box">
                        <i class="fas fa-envelope"></i>
                        <input type="hidden" className="form-control" placeholder="Name"
                          value={this.state.role="Rider"} onChange={this.roleChange} />
                      </div>
                      <div class="input-box">
                        <i class="fas fa-envelope"></i>
                        <input type="text" className="form-control" placeholder="Name"
                          value={this.state.name} onChange={this.nameChange} required/>
                      </div>
                      <div class="input-box">
                        <i class="fas fa-user"></i>
                        <input type="email" className="form-control" placeholder="Email"
                          value={this.state.email} onChange={this.emailChange} required/>
                      </div>
                      <div class="input-box">
                        <i class="fas fa-lock"></i>
                        <input type="text" className="form-control" placeholder="Address"
                          value={this.state.address} onChange={this.addressChange} required/>
                      </div>
                      <div class="input-box">
                        <i class="fas fa-lock"></i>
                        <input type="text" className="form-control" placeholder="Mobile Number"
                          value={this.state.phone} onChange={this.phoneChange} required/>
                      </div>
                      <div class="input-box">
                        <i class="fas fa-lock"></i>
                        <input type="" className="form-control" placeholder="Rider Service Duration"
                          value={this.state.service} onChange={this.servicedurationChange} required/>
                      </div>
                      <div class="input-box">
                        <i class="fas fa-lock"></i>
                        <input type="" className="form-control" placeholder="Vehicle Number"
                          value={this.state.vehiclenum} onChange={this.vehiclenumChange} required/>
                      </div>
                      <div class="input-box">
                        <i class="fas fa-lock"></i>
                        <input type="text" className="form-control" placeholder="Password"
                          value={this.state.password} onChange={this.passwordChange} required/>
                      </div>
                      <div class="button input-box">
                        <button className="btn btn-warning btn-block">Sign up</button>
                      </div>
                      <div class="text sign-up-text">Already have an account? <label for="flip">Login now</label></div>
                    </div>
                  </form>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>

    )
  }
}
export default RiderRegister
