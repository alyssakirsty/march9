import { useState } from "react";
import "../Styles/MainPage.css";
import axios from "axios";
import Snackbar, { SnackbarOrigin } from '@mui/material/Snackbar';
import { Alert } from "@mui/material";

const MainPage =  () => {

    const api = 'http://localhost:8080/api/'
    const [email, setEmail] = useState("")
    const [phoneNumber, setPhoneNumber] = useState("")
    const [open, setOpen] = useState(false)

    const handleSubmit = (e) => {
        axios.post(api + 'contactdetails', 
        {
            "email" : email,
            "phoneNumber" : phoneNumber
        }).then(response => {
            setEmail("")
            setPhoneNumber("")
            setOpen(true)
        }).catch(error => {
            console.log(error)
        })
        e.preventDefault()
    }
    
    const handleClose = () => {
        setOpen(false)
    }

    return (
        <div className="box">
            
            <form className="contact-details-form">
                <p className="form-heading">enter your contact details:</p>
                <div className="input-fields">
                    <input 
                        type="text" 
                        value={email} 
                        placeholder="email"
                        onChange={e => setEmail(e.target.value)}
                    />
                    <input 
                        type="text" 
                        value={phoneNumber} 
                        placeholder="phone number"
                        onChange={e => setPhoneNumber(e.target.value)}
                    />
                    
                </div>
                <button 
                    className="submit-button" 
                    type="submit"
                    onClick={handleSubmit}
                >
                    submit
                </button>
                
            </form>

            <div className="donate">


                <p className="donate">click me $ ---{">"} 
                    <a href="https://gofund.me/39c30795">
                        <img className="horse" src="horse.JPG"></img>
                    </a>

                

                </p>
                
            </div>

            
            

            <Snackbar
                anchorOrigin={{ vertical: 'bottom' , horizontal: 'center' }}
                open={open}
                autoHideDuration={3000}
                onClose={handleClose}
            >
                <Alert
                    onClose={handleClose}
                    severity="success"
                    variant="filled"
                    sx={{ width: '100%' }}
                >
                    response successfully submitted
                </Alert>
            </Snackbar>
        </div>
    )
}

export default MainPage;