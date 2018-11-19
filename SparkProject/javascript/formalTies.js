// Note: This example requires that you consent to location sharing when
// prompted by your browser. If you see the error "The Geolocation service
// failed.", it means you probably did not give permission for the browser to
// locate you.

var map, infoWindow;
function initMap() {
  map = new google.maps.Map(document.getElementById('map'), {
    center: {lat: -34.397, lng: 150.644},
    zoom: 14
  });
  infoWindow = new google.maps.InfoWindow;

  // Try HTML5 geolocation.
  if (navigator.geolocation) {
    navigator.geolocation.getCurrentPosition(function(position) {
      var pos = {
        lat: position.coords.latitude,
        lng: position.coords.longitude
      };

      infoWindow.setPosition(pos);
      infoWindow.setContent('Location found.');
      infoWindow.open(map);
      map.setCenter(pos);
    }, function() {
      handleLocationError(true, infoWindow, map.getCenter());
    });
  } else {
    // Browser doesn't support Geolocation
    handleLocationError(false, infoWindow, map.getCenter());
  }
}

function handleLocationError(browserHasGeolocation, infoWindow, pos) {
  infoWindow.setPosition(pos);
  infoWindow.setContent(browserHasGeolocation ?
                        'Error: The Geolocation service failed.' :
                        'Error: Your browser doesn\'t support geolocation.');
  infoWindow.open(map);
}
$('#cleanerButton').click(function (){
    testApi();
});
function testApi(){
    let proxyUrl = "https://cors-anywhere.herokuapp.com/",
    targetUrl = 'https://maps.googleapis.com/maps/api/place/nearbysearch/json?location=27.9506,82.4572&radius=16000&type=laundry&keyword=dry%20cleaners&key=AIzaSyAn_MTrjdXknXWZiK57Tr_vzcmLyjcxESs';
    axios.get(proxyUrl + targetUrl)
        .then((response) => {
            var results = response.data.results;
            let output='';
            $.each(results, (index, result) => {
                console.log(result);
                output+=`
                    <h3>${result.name}</h3>
                `;
            })
            $('#cleanerResults').html(output);
            console.log(response);
        })
}