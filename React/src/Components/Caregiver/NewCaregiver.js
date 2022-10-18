import React, { Component } from 'react'
import axios from "axios";
import '../test.scss';

class NewCaregiver extends Component {
  constructor() {
    super();
    this.state = {

      "email": '',
      "name": '',
      "phone": '',
      "relation": '',
      "serviceduration": '',
      "password": '',
      "role": '',
      "memail": '',
      "mname": '',
      "address": '',
      "mphone": '',
      "partm": ''

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
  relationChange = (event) => {
    //alert(event.target.value);
    this.setState({
      relation: event.target.value
    })
  }
  passwordChange = (event) => {
    this.setState({
      password: event.target.value
    })
  }
  phoneChange = (event) => {
    //alert(event.target.value);
    this.setState({
      phone: event.target.value
    })
  }
  roleChange = (event) => {
    this.setState({
      role: event.target.value
    })
  }
  memailChange = (event) => {
    //alert(event.target.value);
    this.setState({
      memail: event.target.value
    })
  }

  mnameChange = (event) => {
    //alert(event.target.value);
    this.setState({
      mname: event.target.value
    })
  }
  addressChange = (event) => {
    //alert(event.target.value);
    this.setState({
      address: event.target.value
    })
  }
  mphoneChange = (event) => {
    //alert(event.target.value);
    this.setState({
      mphone: event.target.value
    })
  }
  partmChange = (event) => {
    //alert(event.target.value);
    this.setState({
      partm: event.target.value
    })
  }
  servicedurationChange = (event) => {
    //alert(event.target.value);
    this.setState({
      serviceduration: event.target.value
    })
  }


  addCaregiver = (event) => {

    axios.post('register', this.state)
      .then((res) => {
        this.callMain()
      })
      .catch(err => console.log(err))
    event.preventDefault();
  }

  callMain() {
    alert('Registration Completed, Proceed to Log In!');
}


  authCaregiver = (event) => {
    axios.post('authenticate', this.state)
      .then((res) => {
        localStorage.setItem('login', res.data);
        this.callForCaregiverDashboard()
      })
      .catch((err) => console.log(err))

    event.preventDefault();

  }

  callForCaregiverDashboard() {

    this.props.history.push({
      pathname: '/caregiverdashboard',
      state: { detail: this.state.email }
    })

  }

  render() {
    return (
      <div>

        <div>
          <nav>
            <a href="/">
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

        <div class="mregistration">
          <center> <h1>
            <span3><span>Caregiver</span><span2>Login/Registration </span2></span3>
          </h1>
          </center>
          <div class="container">
            <input type="checkbox" id="flip" />
            <div class="cover">
              <div class="front">
                <img src="https://media.istockphoto.com/photos/vertical-shot-of-fresh-fruit-and-vegetable-juice-in-glass-bottles-picture-id1153044911?k=20&m=1153044911&s=170667a&w=0&h=5INkMQ60hg1cFiwS9fwkpUSuYgfgizdMuws5E0yZ9NA=" alt="" />
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
                  <form onSubmit={this.authCaregiver}>
                    <div class="input-boxes">
                      <div class="input-box">

                        <input type="email" className="form-control" placeholder="Email"
                          value={this.state.email} onChange={this.emailChange} />
                      </div>
                      <br />
                      <div class="input-box">
                        <i class="fas fa-lock"></i>
                        <input type="password" className="form-control" placeholder="Password"
                          value={this.state.password} onChange={this.passwordChange} />
                      </div>

                      <div class="text"><a href="#">Forgot password?</a></div>
                      <div class="button-input-box">
                        <button className="btn-block" type="submit">Sign in</button>
                      </div>
                      <div class="text sign-up-text">Don't have an account? <label for="flip">Sigup now</label></div>

                    </div>
                  </form>
                </div>

                <div class="signup-form">
                  <div class="b">
                    <div class="title">Sign up</div>

                    <div class="form-container">
                      <form onSubmit={this.addCaregiver} role="form" >
                        <input id='step2' type='checkbox' />
                        <input id='step3' type='checkbox' />

                        <div id="part1" class="form-group">
                          <div class="panel panel-primary">
                            <div class="panel-heading">
                              <h2>CAREGIVER INFORMATION</h2>
                            </div>
                            <br />
                            <div class="input-boxes">
                              <div class="input-box">
                                <i class="fas fa-envelope"></i>
                                <input type="hidden" className="form-control" placeholder="Name"
                                  value={this.state.role = "Caregiver"} onChange={this.roleChange} />
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
                                <input type="text" className="form-control" placeholder="Mobile Number"
                                  value={this.state.phone} onChange={this.phoneChange} required/>
                              </div>
                              <div class="input-box">
                                <i class="fas fa-lock"></i>
                                <input type="text" className="form-control" placeholder="Caregiver Relation with Member"
                                  value={this.state.relation} onChange={this.relationChange} required/>
                              </div>
                              <div class="input-box">
                                <i class="fas fa-lock"></i>
                                <input type="text" className="form-control" placeholder="Password"
                                  value={this.state.password} onChange={this.passwordChange} required/>
                              </div>
                            </div>
                            <br />
                            <div class="button-group b" role="group" aria-label="...">
                              <label for='step2' id="continue-step2" class="continue">
                                <div class="btn btn-default btn-lg">Continue</div>
                              </label>
                            </div>
                          </div>
                        </div>

                        <div id="part2" class="form-group">
                          <div class="panel panel-primary">
                            <div class="panel-heading">
                              <h2>MEMBER INFORMATION</h2>
                            </div>
                            <br />
                            <div class="input-boxes">
                              <div class="input-box">
                                <i class="fas fa-envelope"></i>
                                <input type="text" className="form-control" placeholder="Name"
                                  value={this.state.mname} onChange={this.mnameChange}required />
                              </div>
                              <div class="input-box">
                                <i class="fas fa-user"></i>
                                <input type="email" className="form-control" placeholder="Email"
                                  value={this.state.memail} onChange={this.memailChange} required/>
                              </div>
                              <div class="input-box">
                                <i class="fas fa-lock"></i>
                                <input type="text" className="form-control" placeholder="Address"
                                  value={this.state.address} onChange={this.addressChange} required/>
                              </div>
                              <div class="input-box">
                                <i class="fas fa-lock"></i>
                                <input type="text" className="form-control" placeholder="Mobile Number"
                                  value={this.state.mphone} onChange={this.mphoneChange} required/>
                              </div>
                              <div class="input-box">
                                <i class="fas fa-lock"></i>
                                <input type="text" className="form-control" placeholder="Part of Mumbai"
                                  value={this.state.partm} onChange={this.partmChange} required/>
                              </div>

                              <div class="input-box">
                                <i class="fas fa-lock"></i>
                                <input type="text" className="form-control" placeholder="Meal Service Duration"
                                  value={this.state.serviceduration} onChange={this.servicedurationChange} required/>
                              </div>
                            </div>
                            <br />
                            <div class="btn-group" role="group" aria-label="...">
                              <label for='step2' id="back-step2" class="back">
                                <div class="back2" ><img src="./images/back.png" alt="amazing caves coverimage" class="img-fluid" />Back</div>
                              </label>
                            </div>
                            <div class="button-input-box">
                              <button className="btn-block" type="submit">Sign up</button>
                            </div>
                            <div class="text sign-up-text">Already have an account? <label for="flip">Login now</label></div>
                          </div>
                        </div>
                      </form>
                    </div>
                  </div>
                </div>

              </div>
            </div>
          </div>
        </div>
      </div>
    )
  }
}

export default NewCaregiver