DESCRIPTION = "An image for network and communication."
LICENSE = "MIT"
PR = "r1"

require atmel-demo-image.inc

IMAGE_INSTALL += "\
    packagegroup-base-usbhost \
    mpg123 \
    mpio \
    rsync \
    "

IMAGE_INSTALL_append_sama5d2 = " nodejs nodejs-npm"
IMAGE_INSTALL_append_sama5d3 = " nodejs nodejs-npm"
IMAGE_INSTALL_append_sama5d4 = " nodejs nodejs-npm"

# packages needed for greengrass with ECC608
IMAGE_INSTALL_append_sama5d2 = " cryptoauthlib python3-cryptoauthlib p11-kit"
IMAGE_INSTALL_append_sama7 = " cryptoauthlib python3-cryptoauthlib p11-kit"

IMAGE_INSTALL_append_sama5d2-ptc-ek = " ptc-examples"
IMAGE_INSTALL_append_sama5d2-ptc-ek-sd = " ptc-examples"
IMAGE_INSTALL_append_sama5d27-wlsom1-ek-sd = " ptc-examples nginx \
				wilc-demo-fs-overlay \
				wilc-ble-demo \
				wilc-websocket-demo "

IMAGE_INSTALL_append_sama7g5ek = " bonnie++ iozone3 gstreamer1.0 \
				gstreamer1.0-plugins-bad \
				gstreamer1.0-plugins-good \
				gstreamer1.0-plugins-ugly fswebcam ffmpeg \
				libv4l v4l-utils media-ctl libcamera yavta \
				video-capture-at91"
