const saveBtn = document.getElementById("saveBtn");

saveBtn.addEventListener("click", async () => {

    const subject = document.getElementById("subject").value;
    const minutes = parseInt(document.getElementById("minutes").value);

    // 1️⃣ Send POST request
    await fetch("/api/study/sessions", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify({
            subject: subject,
            minutes: minutes
        })
    });

    // 2️⃣ After saving, reload totals
    loadTotals();
});


async function loadTotals() {

    const response = await fetch("/api/study/totals");
    const data = await response.json();

    // Display raw JSON so you can SEE what's happening
    document.getElementById("totals").innerText =
        JSON.stringify(data, null, 2);
}


// Load totals when page first opens
loadTotals();