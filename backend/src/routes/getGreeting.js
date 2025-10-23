const greetings = [
    "¡Hola! ¿Qué tal?",
    "Hello world!",
    "Buenos días",
    "Hey, qué pasa",
    "Saludos desde el backend"
];

function getRandomGreeting() {
    const randomIndex = Math.floor(Math.random() * greetings.length);
    return greetings[randomIndex];
}

module.exports = async (req, res) => {
    const randomGreeting = getRandomGreeting();
    
    res.send({
        greeting: randomGreeting,
    });
};